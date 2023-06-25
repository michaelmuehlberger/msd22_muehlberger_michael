# Maven Site  #

## Was ist notwendig um Maven Site Dokumentation zu generieren? ## 
1. Um eine Maven Site Dokumentation generieren zu können müssen die entsprechenden Plugins im pom.xml hinzugefgt werden
2. Es muss ein entsprechendes Ordnerverzeichnis erstellt werden in src/site mit den jeweiligen Files die man auf der Site darstellen möchste (Markdown, HTML, ..)
3. eine site.xml muss erstellt werden indem die Struktur definiert wird
4. "mvn site" muss in der Konsole ausgeführt werden, die entsprechende generierte site findet man dann im target Ordner.  


## Welche Aspekte, Konfigurationen, Informationen, .. werden in site.xml bzw pom.xml konfiguriert? ##

site.xml: site wird verwendet um die Struktur und das Layout der generierten Site-Dokumentation zu definieren.
Was soll in die der Dokumentation enthalten sein? 
Files und Reports

pom.xml: wird verwendet um plugins für das maven project hinzuzufügen,
hier können auch Informationen über die developer, dependencys, build, report Konfigurationen festgelegt werden.
