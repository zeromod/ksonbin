# ksonbin
***Ksonbin*** is a kotlin wrapper for [jsonbin.io](https://jsonbin.io) *(A free JSON storage and JSON hosting service)*

Ksonbin uses [kotlin coroutines ](https://kotlinlang.org/docs/reference/coroutines-overview.html) for asynchronous network calls, thanks to [Retrofit](https://square.github.io/retrofit/)

## Usage

`Ksonbin` is a singleton using [object declarations](https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations), means statically available to use anywhere and no need to create an instance.

###  Init

Initialisation that needs run only one time 

```kotlin
Ksonbin.init(key = "YOUR_KEY_HERE")
```

> you can grab a key from [jsonbin-keys](https://jsonbin.io/api-keys)

## API Usage

> [API reference](https://jsonbin.io/api-reference) 

### BIN
#### Create

Using the CREATE API, you can Create Public and Private bins.

```kotlin
Ksonbin.Bin.create(data)
```

#### Read

Using the READ API, you can Read Public and Private bins.

```kotlin
Ksonbin.Bin.read(binId)
```

#### Update

Using the UPDATE API, you can Update Public and Private bins.

```kotlin
Ksonbin.Bin.update(binId, data)
```

#### Delete

Using the DELETE API, you can Delete the Public or a Private bins.

```kotlin
Ksonbin.Bin.delete(binId)
```

> Experimental API

#### Request versions

Using the Request Versions API, you can fetch all the versions of a specific Bin.

```kotlin
Ksonbin.Bin.requestVersions(binId)
```



### Collections

#### Create

Using the COLLECTIONS CREATE API, you can CREATE Collections to group the records which later, can be fetched using the Query Builder.

```kotlin
Ksonbin.Collections.create(name)
```

#### Update

Using the COLLECTIONS UPDATE API, you can UPDATE Collections name for now. We might add more meta data to the Collections which you can use the Update API for.

```
Ksonbin.Collections.update(collectionId, name)
```

> Experimental API

#### All bins

Using the Request Versions API, you can fetch all the versions of a specific Bin.

```kotlin
Ksonbin.Collections.allBins(collectionId)
```



### Schema Docs

#### Create

Using the CREATE API, you can Create Schema Docs.

```kotlin
Ksonbin.SchemaDoc.create(name, schema)
```

#### Read

Using the READ API, you can Read the Schema Docs.

```kotlin
Ksonbin.Schema.read(schemaId)
```

#### Update

Using the UPDATE API, you can Update Schema Docs.

```kotlin
Ksonbin.Schema.update(schemaId, schema)
```