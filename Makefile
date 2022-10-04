all: compile verify package test-everything

clean:
	rm output/* 
	mvn clean -DskipTests

compile:
	mvn compile -DskipTests

compile-latest:
	mvn compile -DskipTests exec:java 
	
verify:
	mvn verify -DskipTests

package:
	mvn clean -DskipTests
	mvn clean  -DskipTests
	mvn package  -DskipTests
	cp target/numbertowords.jar output/numbertowords-release.jar
	
test-everything:
	mvn test

search-packages:
	sh scripts/search-package.sh


