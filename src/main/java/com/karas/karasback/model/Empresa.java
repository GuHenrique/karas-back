package com.karas.karasback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // anotation do lombok, gera automaticamente os getter, setters e outros.
@Entity // diz que é uma entidade, que é uma tabela que existe no banco de dados.
@Table(name = "empresas") // A anotação @Table só é necessária caso o nome da tabela criada no banco seja
                          // diferente do nome da entidade, no caso a entidade seria o nome da classe
                          // abaixo "Empresa"
public class Empresa {

    @Id // informa que é uma chave primaria no banco.
    @GeneratedValue(strategy = GenerationType.AUTO) // gera a inserção dos números automaticamente no banco.
    private Long id;

    // @Column(name = "rzSocial") mesma função que o @Table, porém no nome da
    // coluna, caso o nome da coluna do banco for diferente do que a criada no
    // model, vc pode fazer a troca do nome passando os parametros na anotação.
    @Column(length = 200, nullable = false) // informa que é uma coluna no banco. length = controla a quantidade de
                                            // caracteres que a coluna irá aceitar. nullable = se a coluna pode ou nao
                                            // ter o valor nulo inserido. false = não pode / true = pode
    private String razaoSocial;

    @Column(length = 200, nullable = false)
    private String nomeFantasia;

    @Column(length = 20, nullable = false)
    private String cnpj;

}
