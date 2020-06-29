[ksonbin](../../index.md) / [in.zeromod.ksonbin.api](../index.md) / [Bin](index.md) / [update](./update.md)

# update

`suspend fun <reified T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> update(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: T, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): `[`BinUpdate`](../-bin-update/index.md)`<T>`

Using the UPDATE API, you can Update Public and Private bins.

### Parameters

`binId` - String

`data` - T (Any class with @Serializable annotated)

`secretKey` - String? (Required only if you are trying to update a private record)

**Return**
BinUpdate

