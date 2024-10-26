package main

import spock.lang.Specification

class AppSpec extends Specification {

    def "context loads"() {
        when:
        App.main()

        then:
        noExceptionThrown()
    }

}
