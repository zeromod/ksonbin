---
title: Bin.create - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Bin](index.html) / [create](./create.html)

# create

`suspend fun <reified JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(data: JSON, collectionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, private: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`BinCreate`](../-bin-create/index.html)`<JSON>`

Using the CREATE API, you can Create Public and Private bins.

### Parameters

`data` - JSON (Any class with @Serializable annotated)

`collectionId` - String? (Required only if you want to add a record to one of the Collections you created)

`private` - Boolean (Required only if you want to mark the bin as Public)

`name` - String? (Required only if you want to add a Name to your Bin)

**Return**
[BinCreate](../-bin-create/index.html)&lt;[JSON](create.html#JSON)&gt;

