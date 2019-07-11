@RestController
/* RestController chiede a Spring MVC di cercare un browser e che ogni HTTP
endopoint corrisponderà ad una HTTP response e non ad una view, questo perchè
vogliamo solo che compaia del testo nel browser */
public class HelloWorld{
  @RequestMapping("/")
  /* RequestMapping collega l'indirizzo scritto sopra al metodo indicato sotto.
   RequestMapping funziona a cascata, se l'intera classe fosse mappata, ad
   esempio con "/home", allora questo metodo sarebbe mappato su "/home/" */
  public String home(){
    "Hello, World!"
  }
}
/* A questo punto eseguiamo in una console "spring run HelloWorld.groovy"
per poi andare su localhost:8080 */
