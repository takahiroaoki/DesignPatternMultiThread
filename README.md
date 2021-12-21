# DesignPatternMultiThread

本レポジトリのコードは基本的に[増補改訂版 Java言語で学ぶデザインパターン入門マルチスレッド編](https://www.amazon.co.jp/%E5%A2%97%E8%A3%9C%E6%94%B9%E8%A8%82%E7%89%88-Java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%87%E3%82%B6%E3%82%A4%E3%83%B3%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3%E5%85%A5%E9%96%80-%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8-%E7%B5%90%E5%9F%8E-%E6%B5%A9-ebook/dp/B00I8AT1BS/ref=sr_1_1?__mk_ja_JP=%E3%82%AB%E3%82%BF%E3%82%AB%E3%83%8A&crid=O5RTZJD2PC8I&keywords=%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8&qid=1639958696&s=digital-text&sprefix=%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8%2Cdigital-text%2C203&sr=1-1)に基づいています。

Javaのバージョンの関係や学習のために、配布されたコードと異なる箇所が複数あります。元のコードは[SBクリエイティブの商品ページ](https://www.sbcr.jp/product/4797331623/)からダウンロードすることができます。また著者の方の公式サイトは[コチラ](https://www.hyuki.com/)です。


## 利用時の注意事項

書籍とは異なり、本レポジトリのコードはDockerコンテナ上で開発しています。

コンテナについてはDocker Desktop for Windowsを使用し、Visual Studio CodeからRemote Development機能を用いてコンテナに接続しています。

また、末端の各パッケージ内で依存関係は簡潔しており、各パッケージ内のExecuteXXX.javaを実行することができます。

一部、コマンドライン引数などを使用するコードについてはExecuteXXX.javaコード内に実行方法を記載しているのでそれを参考にしてください。

## 参考文献
- [増補改訂版 Java言語で学ぶデザインパターン入門マルチスレッド編](https://www.amazon.co.jp/%E5%A2%97%E8%A3%9C%E6%94%B9%E8%A8%82%E7%89%88-Java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%87%E3%82%B6%E3%82%A4%E3%83%B3%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3%E5%85%A5%E9%96%80-%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8-%E7%B5%90%E5%9F%8E-%E6%B5%A9-ebook/dp/B00I8AT1BS/ref=sr_1_1?__mk_ja_JP=%E3%82%AB%E3%82%BF%E3%82%AB%E3%83%8A&crid=O5RTZJD2PC8I&keywords=%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8&qid=1639958696&s=digital-text&sprefix=%E3%83%9E%E3%83%AB%E3%83%81%E3%82%B9%E3%83%AC%E3%83%83%E3%83%89%E7%B7%A8%2Cdigital-text%2C203&sr=1-1)
