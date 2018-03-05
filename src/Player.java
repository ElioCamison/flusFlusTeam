/**
 *
 * Nos ha contratado una empresa de videojuegos to' puntera. Y desean que nos encarguemos de sus estadísticas teniendo en cuenta estos valores:

 -Muertes
 -Bajas
 -Asaltos
 -Defensas
 -Ejecuciones
 -Gasto por ronda

 Y que estos valores sean representados en un objeto para poder ser transferido mediante JSON a cliente.

 Las estadísticas que quieren obtener son las siguientes:
 -Ratio de Bajas/Muertes
 -El total de Asaltos completados con éxito (porcentual)
 -Media de ejecuciones por partida.
 -Media de gasto por baja realizada.

 Y por último la calidad del jugador que es obtenido mediante los 4 valores anteriores, con la prioridad establecida de la siguiente manera:

 Ratio * Completado con éxito + ( Media ejecuciones * Media gasto - 1000 )

 ejemplo de jugador:
 Elio, Muertes: 1239, Bajas: 2323, Asaltos: 530, Defensas: 314, Ejecuciones: 238, Gasto por ronda: 19300

 */
public class Player {

    private String namePlayer;
    private int deaths ; //--o Muertes
    private int bajas; //--o Bajas
    private int wonAssaults; //--o Asaltos ganados
    private int lostAssaults; //--o Asaltos perdidos
    private int wonDefenses ; //--o Defensas ganadas
    private int lostDefenses ; //--o Defensas perdidas
    private int executions ; //--o Ejecuciones
    private int spendingForRound ; //--o Gasto por ronda

    Player(String namePlayer,int deaths, int bajas, int wonAssaults, int lostAssaults, int wonDefenses, int lostDefenses, int executions, int spendingForRound){
        this.namePlayer = namePlayer;
        this.deaths = deaths;
        this.bajas = bajas;
        this.wonAssaults = wonAssaults;
        this.lostAssaults = lostAssaults;
        this.wonDefenses = wonDefenses;
        this.lostDefenses = lostDefenses;
        this.executions = executions;
        this.spendingForRound = spendingForRound;
    }

    //--o Ratio de bajas / muertes.
    protected float bajasDeath() {
        float rateBD = this.bajas / this.deaths;
        return rateBD;
    }

    //--o El total de Asaltos completados con éxito (porcentual).
    protected float wonAssaults() {
        float totalWonAssaults ;
        float calc = this.wonAssaults + this.lostAssaults;
        float div = 100 / calc;
        totalWonAssaults = this.wonAssaults * div;
        return totalWonAssaults ;
    }

    //--o Media de ejecuciones por partida.
    protected float avgExecutions() {
        return 0.0F;
    }

    //--o Media de gasto por baja realizada.
    protected float avgSpendingForRound() {
        return 0.0F;
    }

    //--o Calidad del jugador
    protected float qualityPlayer(){
        return 0.0F;
    }

    @Override
    public String toString() {
        return "Player{" +
                "namePlayer='" + namePlayer + '\'' +
                ", deaths=" + deaths +
                ", bajas=" + bajas +
                ", wonAssaults=" + wonAssaults +
                ", lostAssaults=" + lostAssaults +
                ", wonDefenses=" + wonDefenses +
                ", lostDefenses=" + lostDefenses +
                ", executions=" + executions +
                ", spendingForRound=" + spendingForRound +
                '}';
    }
}
