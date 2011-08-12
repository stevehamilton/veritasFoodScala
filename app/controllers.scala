package controllers

import play._
import play.mvc._
import play.db.anorm._



object Application extends Controller {
    
    import views.Application._
    
    val result:Boolean = SQL("Select 1").execute()

    def index = {
        html.index("hello world!")
    }


}
