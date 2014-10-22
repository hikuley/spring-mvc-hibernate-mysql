package com.ibrahimkuley.dao;

import com.ibrahimkuley.entity.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hikuley on 19.10.2014.
 */

@Repository //bean
public class ArticleDAOImpl implements ArticleDAO {

    @Autowired
    SessionFactory sessionFactory; // SessionFactory sınıfımızı otomatik olarak alır . . .

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addArticle(Article article) {
        getSession().save(article);
    }

    @Override
    public void updateArtcile(Article article) {
        getSession().update(article);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Article> articleList() {
        return getSession().createQuery("from Article").list();
    }

    @Override
    public void deleteArticle(Article article) {
        getSession().delete(article);
    }

    @Override
    public Article getAtricleById(int id) {
        return (Article) getSession().get(Article.class, new Integer(id));
    }

}
