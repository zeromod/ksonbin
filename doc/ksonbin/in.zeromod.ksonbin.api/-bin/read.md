[ksonbin](../../index.md) / [in.zeromod.ksonbin.api](../index.md) / [Bin](index.md) / [read](./read.md)

# read

`suspend fun <reified R : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> read(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): R`

Using the READ API, you can Read Public and Private bins.

### Parameters

`binId` - String

`secretKey` - String? (Required only if you are trying to read a private record)

**Return**
R (Any class with @Serializable annotated)

