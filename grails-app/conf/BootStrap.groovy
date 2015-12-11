import com.navent.demo.*

class BootStrap {

    def init = { servletContext ->
		
		def author1 = new Author(nombre: 'ema').save(failOnError: true, flush: true)
		def author2 = new Author(nombre: 'david').save(failOnError: true, flush: true)
		
		author1.addToBooks(new Book(titulo: 'uno', fechaPublicacion: new Date()))
		author1.addToBooks(new Book(titulo: 'dos'))
		author1.save(failOnError: true, flush: true)
		
		author2.addToBooks(new Book(titulo: 'tres', fechaPublicacion: new Date()))
		author2.save(failOnError: true, flush: true)
    }
    def destroy = {
    }
}
