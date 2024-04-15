# T1 Compiladores

* Heitor Colichio - 800423
* Caio Obatake Watari Gonçalves Cadini - 8003833
* Luís Lourenço - 800210

## Versões

* Antlr = 4.12.0
* jUnit = 4.11
* maven-clean-plugin = 3.1.0
* maven-resources-plugin = 3.0.2
* maven-compiler-plugin = 3.8.0
* maven-surefire-plugin = 2.22.1
* maven-jar-plugin = 3.0.2
* maven-install-plugin = 2.5.2
* maven-deploy-plugin = 2.8.2
* maven-site-plugin = 3.7.1
* maven-project-info-reports-plugin = 3.0.0

## Execução

### Criação do projeto

A criação do projeto foi realizada utilizando como base o repositório da matéria no github, tendo criado o projeto usando o comando maven: 
 ```
 mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4"
 ```
Define value for property 'groupId': br.ufscar.dc.compiladores Define value for property 'artifactId': novo-la-lexico Define value for property 'version' 1.0-SNAPSHOT: : Define value for property 'package' br.ufscar.dc.compiladores: : br.ufscar.dc.compiladores.novo.la.lexico

Foram realizadas algumas mudanças no arquivo pom.xml para adicionar dependências (antlr4) e também para facilitar a compilação do programa

```
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>br.ufscar.dc.compiladores</groupId>
  <artifactId>novo-la-lexico</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>novo-la-lexico</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.antlr</groupId>
      <artifactId>antlr4</artifactId>
      <version>4.12.0</version>
      <classifier>complete</classifier>
    </dependency>
  </dependencies>

  <build>
          <plugins>
            <plugin>
                <groupId>org.antlr</groupId>
                <artifactId>antlr4-maven-plugin</artifactId>
                <version>4.12.0</version>
                <executions>
                    <execution>
                        <id>antlr</id>
                        <goals>
                            <goal>antlr4</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>br.ufscar.dc.compiladores.novo.la.lexico.App</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
                <executions>
                    <execution>
                        <id>make-assembly</id>
                        <phase>package</phase>
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
        <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>3.7.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
```
### Compilação do Código
Para realizar a compilação do código, utiliza-se o comando:

```
mvn package
```
### Execução + Argumentos
Isso cria o arquivo jar para execução na paste target cuja execução pode ser realizada a partir dos seguintes parâmetros:
```
java -jar <caminho para o arquivo novo-la-lexico-1.0-SNAPSHOT-jar-with-dependencies> <caminho para o arquivo txt de entrada> <caminho para o arquivo txt de saída>
```