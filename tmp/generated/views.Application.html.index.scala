
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String):Html = {
                            try {
                                _display_ {

format.raw/*1.16*/("""

""")+_display_(/*3.2*/main("Home")/*3.14*/ {format.raw/*3.16*/("""
    <img src=""")+_display_(/*4.15*/asset("public/images/veritasFood.jpg"))+format.raw/*4.53*/(""" />
    <br>
    <input id=lookup name=lookup></input>
    <img src=""")+_display_(/*7.15*/asset("public/images/cow.png"))+format.raw/*7.45*/(""" onclick=fnLookup() />

""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Thu Aug 11 08:02:01 PDT 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: 5490557a1ddf4e6c1c9e6ea62c5c3e8dcdbbca1c
                    MATRIX: 329->1|450->15|478->18|498->30|518->32|559->47|617->85|712->154|762->184
                    LINES: 10->1|14->1|16->3|16->3|16->3|17->4|17->4|20->7|20->7
                    -- GENERATED --
                */
            
