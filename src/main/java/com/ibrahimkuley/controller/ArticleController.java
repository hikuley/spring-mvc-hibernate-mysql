package com.ibrahimkuley.controller;

import com.ibrahimkuley.entity.Article;
import com.ibrahimkuley.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class ArticleController {

    @Autowired //otomatik oluşturuluyor new anahtar sözcüğü kullanılıp ekleniyormuş gibi düşünebiliriz.
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public String personIndex(ModelMap model) {
        List<Article> articleList = articleService.articleList();
        model.addAttribute("articleList", articleList);
        return "index";
    }

    @RequestMapping(value = "/articleAdd", method = RequestMethod.POST)
    public String articleAdd(@ModelAttribute("article") Article article) {

        this.articleService.addArticle(article);
        return "redirect:/";
    }

    @RequestMapping(value = "/getArticleUpdate/{id}", method = RequestMethod.GET)
    public String getArticleUpdate(@PathVariable("id") int id, ModelMap model) {
        Article article = this.articleService.getAtricleById(id);
        model.addAttribute("article", article);
        return "update";
    }

    @RequestMapping("/articleDelete/{id}")
    public String articleDelete(@PathVariable("id") int id) {
        Article article = new Article();
        article.setId(id);
        this.articleService.deleteArticle(article);
        return "redirect:/";
    }

    @RequestMapping(value = "/articleUpdate", method = RequestMethod.POST)
    public String articleUpdate(@ModelAttribute("article") Article article) {
        this.articleService.updateArtcile(article);
        return "redirect:/";
    }

}