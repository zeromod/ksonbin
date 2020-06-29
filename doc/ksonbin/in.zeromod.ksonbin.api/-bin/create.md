[ksonbin](../../index.md) / [in.zeromod.ksonbin.api](../index.md) / [Bin](index.md) / [create](./create.md)

# create

`suspend fun <reified T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(data: T, private: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`BinCreate`](../-bin-create/index.md)`<T>`

Using the CREATE API, you can Create Public and Private bins.

### Parameters

`data` - T (Any class with @Serializable annotated)

`private` - Boolean (Required only if you want to mark the bin as Public)

`name` - String? (Required only if you want to add a Name to your Bin)

**Return**
BinCreate

