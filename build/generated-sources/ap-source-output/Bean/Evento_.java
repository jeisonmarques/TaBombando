package Bean;

import Bean.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-06T19:30:50")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Date> dataHoraInicial;
    public static volatile SingularAttribute<Evento, Estabelecimento> idEstabelecimento;
    public static volatile SingularAttribute<Evento, Integer> idEvento;
    public static volatile SingularAttribute<Evento, String> nome;
    public static volatile SingularAttribute<Evento, Date> dataHoraFinal;
    public static volatile SingularAttribute<Evento, String> descricao;

}