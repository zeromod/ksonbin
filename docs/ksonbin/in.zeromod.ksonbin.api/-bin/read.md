---
title: Bin.read - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Bin](index.html) / [read](./read.html)

# read

`suspend fun <reified JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> read(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, binVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): JSON`

Using the READ API, you can Read Public and Private bins.

### Parameters

`binId` - String

`binVersion` - Int? (Required only if you are trying to read a specific version of bin)

`secretKey` - String? (Required only if you are trying to read a private record)

**Return**
[JSON](read.html#JSON) (Any class with @Serializable annotated)

