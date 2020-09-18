# Local Snowflakes
A local implementation of Snowflake generation in Java.

Licensed under the [Apache 2.0 License](https://github.com/arudiscord/snowflake-local/blob/master/LICENSE).

## Notice

This library is now discontinued, use [Nanoflakes Java implementation](https://github.com/nanoflakes/nanoflakes-java) now.

### Installation

![Latest Version](https://api.bintray.com/packages/arudiscord/maven/snowflake-local/images/download.svg)

Using in Gradle:

```gradle
repositories {
  jcenter()
}

dependencies {
  compile 'net.notjustanna.libs:snowflake-local:LATEST' // replace LATEST with the version above
}
```

Using in Maven:

```xml
<repositories>
  <repository>
    <id>central</id>
    <name>bintray</name>
    <url>http://jcenter.bintray.com</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>net.notjustanna.libs</groupId>
    <artifactId>snowflake-local</artifactId>
    <version>LATEST</version> <!-- replace LATEST with the version above -->
  </dependency>
</dependencies>
```

### Usage

Use `LocalGenerator` or `LocalGeneratorBuilder` to create the local generators.

```java
SnowflakeGenerator generator = new LocalGeneratorBuilder()
    .epoch(1420070400000L)
    .build();
```

Then use the `SnowflakeGenerator` to generate IDs.

```java
long id = generator.getDatacenter(3L).getWorker(0L).generate();
```

### Support




