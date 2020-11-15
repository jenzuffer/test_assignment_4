Test assignment 4:

Mockito powerups: 
   * How do you veryify that a mock was called? 
     * Mockito har mange indbygget fejlbeskeder for at beskrive når man bruger Mockito forkert. Den måde
     man kan checke på er ved at kalde verify() metoden fra Mockito som kræver en mock og en verification
     mode. På grund af de type stærke parameter krav er man sikker på at det er en mockito instans man 
     tester.
     
   * How do you verify a mock was not called?
    * Mockito udprinter mange informationer som er brugbare f. eks for at indikere hvis den mock man laver
    slet ikke ville blive brugt til noget eller tested på noget. Igennem TDD forløbet stødte jeg f. eks på:
    "org.mockito.exceptions.misusing.UnfinishedVerificationException: 
     Missing method call for verify(mock) here:
     -> at integration.servicelayer.ServiceTestTicTacToe.mustCreateMocks(ServiceTestTicTacToe.java:40)
     
     Example of correct verification:
         verify(mock).doSomething()
     
     Also, this error might show up because you verify either of: final/private/equals()/hashCode() methods.
     Those methods *cannot* be stubbed/verified.
     Mocking methods declared on non-public parent classes is not supported."
     Her istedet for at give et forkert korrekte svar påpeger mockito at der er problemer i forhold til
     hvad verify mock tester. Igennem mockitos fejl besked forstod jeg så at jeg havde brugt times metoden
     forkert i mockito. Denne tjekker om en hvis metode er bleven kørt et hvis antal gange og er bleven
     korregeret og flyttet over i sin egen test kaldet mustInteractWithMocks(). Igennem Times metoden kan 
     der testes igennem mockito hvor ofte mocken har interageret med at stykke kode. Dette kam dermed
     tested om mockito interagerer korrekte. jeg troede først i en længere periode at det indikere hvor 
     ofte den ville køre en metode f. eks. 
     
     * How do you specify how many times a mock should be called?
      * times nævner ikke hvor ofte den skal køre men tjekker istedet hvor ofte den egentlig har kørt. 
      
      
     