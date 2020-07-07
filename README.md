# ksonbin
***Ksonbin*** is a kotlin wrapper for [jsonbin.io](https://jsonbin.io) *(A free JSON storage and JSON hosting service)*

Made with [ktor](https://ktor.io/) for light dependencies and 100% kotlin :heart:

## Usage

**Gradle**

> [kotlinx-serialization](https://github.com/Kotlin/kotlinx.serialization) gradle plugin is required for JSON serialization/de-serialization
>
> Below is how it can be added with ksonbin, more info [here](https://github.com/Kotlin/kotlinx.serialization#gradle)

*Kotlin DSL*

```kotlin
 plugins {
 	kotlin("plugin.serialization") version "1.3.70"
 }
```

```kotlin
dependency {
	implementation("in.zeromod:ksonbin:1.0")
}
```

*Groovy DSL*

```kotlin
plugins {
 	id 'org.jetbrains.kotlin.plugin.serialization' version '1.3.70'
}
```

```kotlin
dependency {
	implementation "in.zeromod:ksonbin:1.0"
}
```

###  Init

`Ksonbin` is a singleton using [object declarations](https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations), means statically available to use anywhere and no need to create an instance.

Initialisation that needs run only one time.

```kotlin
Ksonbin.init(secretKey = "YOUR_KEY_HERE")
```

> you can grab a key from [jsonbin-keys](https://jsonbin.io/api-keys)

## API Usage

> Recommended reading this first : [Jsonbin API reference](https://jsonbin.io/api-reference) 

[Ksonbin Documentation](https://zeromod.in/ksonbin/)

## Quick sample

```kotlin
fun main() {
    Ksonbin.init("YOUR_API_KEY_HERE")
    
    val newBin: BinCreate<Chat> = Ksonbin.bin.create(Chat("Hi"))
    //BinCreate(success=true, data=Chat(message=Hi), id=5efcc1f87f16b71d48a96f91, private=true)
    
    val chat: Chat = Ksonbin.bin.read(newBin.id)
    //Chat(message=Hi)
}

@Serializable
data class Chat(
    val message: String
)
```

> More samples at [KsonbinSample.kt](https://github.com/zeromod/ksonbin/blob/master/sample/src/main/kotlin/KsonbinSample.kt)

### Android Usage

For adding this library to android, add the below line in build.gradle (app- level) `android` block

```groovy
android {
    //other configs
	
    packagingOptions {
        exclude 'META-INF/*.kotlin_module'
    }
}
```

