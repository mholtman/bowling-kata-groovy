/**
 * Created by mholtman on 4/23/15.
 */



import spock.lang.Specification


class BowlingKataSpec extends Specification {
    def "bowl single frame of gutter balls"() {
        def bowling = new BowlingGame()

        when:
            bowling.rollFrame(0,0)

        then:
            bowling.score  == 0


    }

    def "bowl single frame of single pins"() {
        def bowling = new BowlingGame()

        when:
            bowling.rollFrame(1,1)

        then:
            bowling.score == 2
    }

}




