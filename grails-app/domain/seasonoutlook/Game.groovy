package seasonoutlook

class Game {
    Date date
    String location
    String stadium
    Team homeTeam
    Team awayTeam

    static constraints = {
        date max: new Date()
        location maxSize: 150, blank: false, nullable: false
        stadium blank: false, nullable: false
        homeTeam blank: false, nullable: false
        awayTeam blank: false, nullable: false
    }
}
