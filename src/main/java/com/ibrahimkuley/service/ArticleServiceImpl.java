package com.ibrahimkuley.service;

import com.ibrahimkuley.dao.ArticleDAO;
import com.ibrahimkuley.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hikuley on 20.10.2014.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired //otomotik bir şekilde bean'a atamasını yap
    private ArticleDAO articleDAO;

    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Override
    @Transactional
    public void addArticle(Article article) {
        this.articleDAO.addArticle(article);
    }

    @Override
    @Transactional
    public void updateArtcile(Article article) {
        this.articleDAO.updateArtcile(article);
    }

    @Override
    @Transactional
    public List<Article> articleList() {
        return this.articleDAO.articleList();
    }

    @Override
    @Transactional
    public void deleteArticle(Article article) {
        this.articleDAO.deleteArticle(article);
    }

    @Override
    @Transactional
    public Article getAtricleById(int id) {
        return articleDAO.getAtricleById(id);
    }
}
