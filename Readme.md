### Simple Wicket application

````shell
echo $JAVA_HOME
/usr/lib/jvm/java-17-openjdk-amd64
````

Run:

````shell
mvn jetty:run
````

or:

````shell
./run.sh
````

Open in browser [http://127.0.0.1:8080/](http://127.0.0.1:8080/) 

### Пример изменения цвета ссылки

Исходное значение определенное в правиле 
src/main/java/org/wicketTutorial/commons/bootstrap/layout/style.css
(строка 166)

````css
a {
    color: #DD4814;
}
````

Изменено в my.css (строка 56) на :

````css
a, a:visited, a:hover, a:active {
    color : #FF5500;
}
````
