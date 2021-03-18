 data class Atom(
     var name: String ,
     var representation: String,
     var alignment: String

 ) {
     override fun toString(): String {
         return "Atom(name='$name')"
     }
 }