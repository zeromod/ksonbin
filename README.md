# ksonbin
***Ksonbin*** is a kotlin wrapper for [jsonbin.io](https://jsonbin.io) *(A free JSON storage and JSON hosting service)*

Made with [ktor](https://ktor.io/) for light dependencies and 100% kotlin :heart:

## Usage

**Gradle**

> [kotlinx-serialization](https://github.com/Kotlin/kotlinx.serialization) gradle plugin is required for JSON serialization/de-serialization
>
> Below is how it can be added with ksonbin, more info [here](https://github.com/Kotlin/kotlinx.serialization#gradle)

*Kotlin DSL*

​	add `kotlin("plugin.serialization") version "1.3.70"` in plugins

​	add `implementation("in.zeromod:ksonbin:1.0")` in dependencies

*Groovy DSL*

​	add `id 'org.jetbrains.kotlin.plugin.serialization' version '1.3.70'` in plugins

​	add `implementation "in.zeromod:ksonbin:1.0"` in dependencies

###  Init

`Ksonbin` is a singleton using [object declarations](https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations), means statically available to use anywhere and no need to create an instance.

Initialisation that needs run only one time.

```kotlin
Ksonbin.init(secretKey = "YOUR_KEY_HERE")
```

> you can grab a key from [jsonbin-keys](https://jsonbin.io/api-keys)

## API Usage

> [API reference](https://jsonbin.io/api-reference) 

### BIN
#### Create

```kotlin
Ksonbin.bin.create(data)
```

*usage*

```kotlin
/**
 * Using the CREATE API, you can Create Public and Private bins.
 *
 * @param data T (Any class with @Serializable annotated)
 * @param private Boolean (Required only if you want to mark the bin as Public)
 * @param name String? (Required only if you want to add a Name to your Bin)
 *
 * @return BinCreate<T>
 */
```



#### Read

```kotlin
Ksonbin.bin.read(binId)
```

*usage*

```kotlin
/**
 * Using the READ API, you can Read Public and Private bins.
 *
 * @param binId String
 * @param secretKey String? (Required only if you are trying to read a private record)
 *
 * @return R (Any class with @Serializable annotated)
 */
```



#### Update

```kotlin
Ksonbin.bin.update(binId, data)
```

*usage*

```kotlin
/**
 * Using the UPDATE API, you can Update Public and Private bins.
 *
 * @param binId String
 * @param data T (Any class with @Serializable annotated)
 * @param secretKey String? (Required only if you are trying to update a private record)
 * 
 * @return BinUpdate<T>
 */
```



#### Delete

```kotlin
Ksonbin.bin.delete(binId)
```

*usage*

```kotlin
/**
 * Using the DELETE API, you can Delete the Public  or a Private bins.
 *
 * @param binId String
 * 
 * @return BinDelete
 */
```



> Experimental API

#### Request versions

Using the Request Versions API, you can fetch all the versions of a specific Bin.

```kotlin
Ksonbin.bin.requestVersions(binId)
```



### Collections

#### Create

```kotlin
Ksonbin.collection.create(name)
```

*usage*

```kotlin
/**
 * Using the COLLECTIONS CREATE API, you can CREATE Collections to group the records
 * which later, can be fetched usin the Query Builder.
 *
 * @param collectionInfo CollectionInfo
 *
 * @return CollectionCreate
 */
```



#### Update

```
Ksonbin.collection.update(collectionId, name)
```

*usage*

```kotlin
/**
 * Using the COLLECTIONS UPDATE API, you can UPDATE Collections name for now.
 * We might add more meta data to the Collections which you can
 * use the Update API for.
 *
 * @param collectionID String
 * @param collectionInfo CollectionInfo
 * @param schemaDocId String? (Required only if you want to attach a Schema Doc to the Collection)
 * @param removeSchemaDoc Boolean (Required only if you want to detach a Schema Doc from the Collection)
 *
 * @return CollectionUpdate
 */
```



> Experimental API

#### All bins

Using the Request Versions API, you can fetch all the versions of a specific Bin.

```kotlin
Ksonbin.collection.allBins(collectionId)
```



### Schema Docs

#### Create

```kotlin
Ksonbin.schemaDoc.create(name, schema)
```

*usage*

```kotlin
/**
 * Using the CREATE API, you can Create Schema Docs.
 *
 * @param name String
 * @param data D
 *
 * @return SchemaCreate<D>
 */
```



#### Read

```kotlin
Ksonbin.schema.read(schemaId)
```

*usage*

```kotlin
/**
 * Using the READ API, you can Read the Schema Docs.
 *
 * @param schemaId String
 *
 * @return D
 */
```



#### Update

```kotlin
Ksonbin.schema.update(schemaId, schema)
```

*usage*

```kotlin
/**
 * Using the UPDATE API, you can Update Schema Docs.
 *
 * @param schemaId String
 * @param data D
 *
 * @return SchemaUpdate<D>
 */
```

