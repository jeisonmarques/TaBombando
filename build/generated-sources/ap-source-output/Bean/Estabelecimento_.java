package Bean;

import Bean.Evento;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-10T19:47:03")
@StaticMetamodel(Estabelecimento.class)
public class Estabelecimento_ { 

    public static volatile SingularAttribute<Estabelecimento, Integer> idEstabelecimento;
    public static volatile SingularAttribute<Estabelecimento, String> fones;
    public static volatile SingularAttribute<Estabelecimento, String> endereco;
    public static volatile SingularAttribute<Estabelecimento, String> nome;
    public static volatile SingularAttribute<Estabelecimento, Long> cnpj;
    public static volatile CollectionAttribute<Estabelecimento, Evento> eventoCollection;

}