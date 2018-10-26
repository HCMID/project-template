// Add cases to match below:

//import edu.holycross.shot.virgapes._
import edu.holycross.shot.mid.validator._
import edu.holycross.shot.cite._


def ortho(orthoName: String, docs: CtsUrn) : Option[MidOrthography]= {
  orthoName.toLowerCase match {
    //case "virgapes" => Some(Virgapes(docs))
    case _ => None
  }
}
