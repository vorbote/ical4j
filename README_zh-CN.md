## Open Source Core

这是一个非常实用的 `Java` 类库。我们在这次的更新中，将原先的 `commons` 类库、 `common-utils` 类库以及 `time-lib` 类库进行了合并。从此，
您就再也没有必要引入如此之多的类库。

当然，这个类库并没有单独引用的必要，您完全可以通过引入我们的其他类库，例如方便你使用 **JSON Web Token** 的类库 
[`simple-jwt`](https://github.com/vorbote/simple-jwt) ，或者是方便你进行 **Web Application** 开发的
[`web-dev-suite`](https://github.com/vorbote/web-dev-suite) 。如果您使用的是 `SpringBoot` 框架，那么您还可以使用我们将专为 
`SpringBoot` 优化的 [`webdev-spring-boot-starter`](https://github.com/vorbote/webdev-spring-boot-starter)。

> 该库现在处于 **_ALPHA_** 测试中，如果您想帮助我们测试，您可以克隆此库并使用 **maven** 或 **gradle** 将其构建到您的本地存储库。如果您在
> 使用过程中发现任何错误或有任何疑问，请随时通过提交 **Issues** 与我们描述你遇到的情况。如果你有能力修复或自行改进，我们也欢迎您的 
> **Pull Request**。