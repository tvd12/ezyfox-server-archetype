#export EZYFOX_SERVER_HOME=
mvn -pl . clean install
mvn -pl ${artifactId}-common -Pexport clean install
mvn -pl ${artifactId}-app-api -Pexport clean install
mvn -pl ${artifactId}-app-entry -Pexport clean install
mvn -pl ${artifactId}-plugin -Pexport clean install