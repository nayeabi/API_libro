[![Evidencia.jpg](https://i.postimg.cc/QMJS4HQb/Evidencia.jpg)](https://postimg.cc/4Knzn4F7)
@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroServiceImpl libroServiceImpl;

    public LibroController(LibroServiceImpl libroService) {
        this.libroServiceImpl = libroService;
    }

    @GetMapping
    public ResponseEntity<List<Libro>> getAllLibros() {
        return new ResponseEntity<>(libroServiceImpl.getAllLibros(), HttpStatus.OK);
    }

    @GetMapping("/{id_libro}")
    public ResponseEntity<Libro> getLibroById(@PathVariable("id_libro") Long id) {
        Optional<Libro> libro = libroServiceImpl.getLibroById(id);
        return libro.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Libro> addLibro(@RequestBody Libro libro) {
        libroServiceImpl.addLibro(libro);
        return new ResponseEntity<>(libro, HttpStatus.CREATED);
    }
    
}
