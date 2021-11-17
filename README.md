# cloudtower-java-sdk

use openapi-generator to create sdk based on different library for cloud tower.

## usage

There is already two sdk been generated:

- ~~cloudtower-java-sdk-retrofit2, using retrofit2;~~ (temporary removed, need testing)
- cloudtower-java-sdk-okhttp-gson, using okhttp3 as httpclient with gson 2.8.x, required Java 8+.

To install jar locally, check `dist/<library>` and install,

```shell
mvn install:install-file -D"file=<path/to/jar>" -D"pomFile=<path/to/pom>"
```

For developer, check `README.md` under the library directory for detail.

## other library

For other library, use mvn generate-sources to create a sdk generated with selected library by openapi-generator, default value is `okhttp-gson`.

```shell
mvn generate-sources -D"openapi.generator.maven.plugin.library=<library>"
```

### support library

support library is based on openapi-generator

- jersey1 - HTTP client: Jersey client 1.19.x. JSON processing: Jackson 2.9.x. Enable gzip request encoding using '-DuseGzipFeature=true'. IMPORTANT NOTE: jersey 1.x is no longer actively maintained so please upgrade to 'jersey2' or other HTTP libraries instead.
- jersey2 - HTTP client: Jersey client 2.25.1. JSON processing: Jackson 2.9.x
- feign - HTTP client: OpenFeign 10.x. JSON processing: Jackson 2.9.x.
- okhttp-gson - [DEFAULT] HTTP client: OkHttp 3.x. JSON processing: Gson 2.8.x. Enable Parcelable models on Android using '-DparcelableModel=true'. Enable gzip request encoding using '-DuseGzipFeature=true'.
- retrofit2 - HTTP client: OkHttp 3.x. JSON processing: Gson 2.x (Retrofit 2.3.0). Enable the RxJava adapter using '-DuseRxJava[2/3]=true'. (RxJava 1.x or 2.x or 3.x)
- resttemplate - HTTP client: Spring RestTemplate 4.x. JSON processing: Jackson 2.9.x
- webclient - HTTP client: Spring WebClient 5.x. JSON processing: Jackson 2.9.x
- resteasy - HTTP client: Resteasy client 3.x. JSON processing: Jackson 2.9.x
- vertx - HTTP client: VertX client 3.x. JSON processing: Jackson 2.9.x
- google-api-client - HTTP client: Google API client 1.x. JSON processing: Jackson 2.9.x
- rest-assured - HTTP client: rest-assured : 4.x. JSON processing: Gson 2.x or Jackson 2.10.x. Only for Java 8
- native - HTTP client: Java native HttpClient. JSON processing: Jackson 2.9.x. Only for Java11+
- microprofile - HTTP client: Microprofile client 1.x. JSON processing: JSON-B
- apache-httpclient - HTTP client: Apache httpclient 4.x
