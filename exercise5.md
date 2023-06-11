# Logging  #

## Warum werden Logging Bibliotheken verwendet ## 
Theoretisch könnte man auch mit normalen print Statements loggen, dies sollte jedoch nicht gemacht werden, da diese nicht sehr einfach zu tracken sind, und mit logging auf verschiedenen Level geloggt werden kann. Außerdem kann man bei print logs nicht so gut nachvollziehen, von welcher Quelle diese kommen (Maven, Gradle, ..).
Ein weiterer Vorteil von Logging Bibliotheken ist, dass diese auf mehrere verschiedene Arten gelogged und gespeichert werden können, sodass man ebenfall auf ältere log files zugreifen kann.

## Welche Loglevel gibt es in Log5J und was hat es damit auf sich ##
Es gibt folgende Log Leven in folgender Hierarchie: 

ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL

Beim Logging kann angegeben werden, auf welchem Level der oben genannten Level sich die Nachricht befindet. In der Konfig kann dann eingestellt werden welche Level gelogged werden sollen, es werden dann auch alle darunterliegenden Level mit gelogged.
ZB: Beim Level All werden alle Level gelogged, beim Level Info nur Info, warn, error und Fatal. 

## Welche Konfigurationsmöglichkeiten bietet log4J ## 
Die config Datei besteht aus 2 Hauptteilen:
Appenders – Wo werden die logs geprinted? (Datei/Konsole/..). Es ist möglich mehrere Appenders zu haben.
Loggers – Von wo und was soll gelogged werden. Hier kann auch eingestellt werden von welchem Loglevel an man loggen möchte.