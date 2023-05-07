# Git Basics #

+ **git config** 
Dieser Befehl wird für die generelle Git Konfiguration wie Name des des Benutzers, Email, .. usw verwendet. Die jeweilige einstellung die durch den Befehl vorgenommen wird, wird durch den Parameter festgelegt.  
Beispiele:
Benutzername: `git config --global user.name "Michael Muehlberger"`
Email: `git config --global user.email "michael.muehlberger@edu.fh-joanneum.at"`

+ **git init**:
Dieser Befehl initialisiert das lokale Git Repository (Ordner ist ab jetzt working directory in dem nun eine Versionierung stattfinden kann). Im Root dieses Verzeichnisses wird der .git Ordner mit den Metadaten der Versionierung gespeichert. 

+ **git commit**
Alle veränderten/neuen Dateien bzw.Verzeichnisse die sich in dem Staging Bereich befinden werden mit diesem Command in das lokale Repository als neue Version hinzugefügt.
Nach dem command wird mit dem Parameter -m "message" eine message dem commit angefügt, der die Veränderung die vorgenommen wurde beschreibt.

+ **git add**
Der Command fügt Dateien/Verzeichnisse erstmalig oder nach Veränderung den Staging Bereich hinzu.

+ **git status**
Stellt alle neuen und geänderten Dateien des Git Repositorys in einer Übersicht dar.

+ **git log**
Dieser Command kann nach einem Commit ausgeführt werden. Er zeigt Informationen der letzten Commits an, das Datum, die Commit Message und der Autor des Commits. Es werden auch Beziehungen zu vorherigen Commits angezeigt.

+ **git diff**
Mit dem Command können Unterschiede zwischen Commits bzw. zwischen einem Commit und dem working directory angezeigt werden.

+ **git pull**
Dateien/Verzeichnisse werden vom Server geladen und das lokale Repository wird aktualisiert.

+ **git push**
Dateien/Verzeichnisse des lokalen Repositorys werden an den Server gesendet.