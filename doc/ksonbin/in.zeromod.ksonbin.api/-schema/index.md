---
title: Schema - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Schema](./index.html)

# Schema

`class Schema`

### Constructors

| [&lt;init&gt;](-init-.html) | `Schema(ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.html)`)` |

### Properties

| [ksonbin](ksonbin.html) | `val ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.html) |

### Functions

| [create](create.html) | Using the CREATE API, you can Create Schema Docs.`suspend fun <SCHEMA : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: SCHEMA): `[`SchemaCreate`](../-schema-create/index.html)`<SCHEMA>` |
| [read](read.html) | Using the READ API, you can Read the Schema Docs.`suspend fun <SCHEMA : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> read(schemaId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): SCHEMA` |
| [update](update.html) | Using the UPDATE API, you can Update Schema Docs.`suspend fun <SCHEMA : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> update(schemaId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: SCHEMA): `[`SchemaUpdate`](../-schema-update/index.html)`<SCHEMA>` |

