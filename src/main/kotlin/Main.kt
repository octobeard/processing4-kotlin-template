import processing.core.PApplet

fun main() = PApplet.main(Hello::class.java.name)

class Hello : PApplet() {
    override fun settings() {
        size(500, 500)
    }
    override fun setup() {
    }
    override fun draw() {
        circle(width/2f, height/2f, 100f)
    }
}
