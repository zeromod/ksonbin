---
title: Bin.update - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Bin](index.html) / [update](./update.html)

# update

`suspend fun <reified JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> update(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: JSON, versioning: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): `[`BinUpdate`](../-bin-update/index.html)`<JSON>`

Using the UPDATE API, you can Update Public and Private bins.

### Parameters

`binId` - String

`data` - JSON (Any class with @Serializable annotated)

`versioning` - Boolean (Required only if you want to disable versioning on private records)

`secretKey` - String? (Required only if you are trying to update a private record)

**Return**
[BinUpdate](../-bin-update/index.html)&lt;[JSON](update.html#JSON)&gt;

