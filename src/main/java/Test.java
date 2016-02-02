import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;

/**
 * Created by pansen on 16/2/2.
 */
public class Test {

  public static void main(String[] args) {
    Spider.create(new GithubRepoPageProcessor()).addUrl("https://github.com/code4craft")
        .addPipeline(new ConsolePipeline()).thread(
        5).run();
  }
}
