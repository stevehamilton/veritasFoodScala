
                    package views.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object main extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String = "")(body: => Html):Html = {
                            try {
                                _display_ {

format.raw/*1.36*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>""")+_display_(/*6.17*/title)+format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href="""")+_display_(/*7.54*/asset("public/stylesheets/main.css"))+format.raw/*7.90*/("""">
        <link rel="shortcut icon" type="image/png" href="""")+_display_(/*8.59*/asset("public/images/favicon.png"))+format.raw/*8.93*/("""">
        <script src="""")+_display_(/*9.23*/asset("public/javascripts/jquery-1.5.2.min.js"))+format.raw/*9.70*/("""" type="text/javascript"></script>
        <script src="""")+_display_(/*10.23*/asset("public/javascripts/common.js"))+format.raw/*10.60*/("""" type="text/javascript"></script>
    </head>
    <body>
        """)+_display_(/*13.10*/body)+format.raw/*13.14*/("""
    </body>
</html>
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Thu Aug 11 07:59:31 PDT 2011
                    SOURCE: /app/views/main.scala.html
                    HASH: b6f0b66b4f70e838bceccd2ad1881810c48e7cdd
                    MATRIX: 316->1|457->35|535->87|560->92|648->154|704->190|791->251|845->285|896->310|963->357|1047->414|1105->451|1199->518|1224->522
                    LINES: 10->1|14->1|19->6|19->6|20->7|20->7|21->8|21->8|22->9|22->9|23->10|23->10|26->13|26->13
                    -- GENERATED --
                */
            
