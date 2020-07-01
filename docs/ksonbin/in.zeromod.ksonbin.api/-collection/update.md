---
title: Collection.update - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Collection](index.html) / [update](./update.html)

# update

`suspend fun update(collectionID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, schemaDocId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, removeSchemaDoc: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`CollectionUpdate`](../-collection-update/index.html)

Using the COLLECTIONS UPDATE API, you can UPDATE Collections name for now.
We might add more meta data to the Collections which you can
use the Update API for.

### Parameters

`collectionID` - String

`name` - String

`schemaDocId` - String? (Required only if you want to attach a Schema Doc to the Collection)

`removeSchemaDoc` - Boolean (Required only if you want to detach a Schema Doc from the Collection)

**Return**
[CollectionUpdate](../-collection-update/index.html)

