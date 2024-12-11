package org.landlord.demo02;

/**
 * 具体集合类
 * @author: landlord
 * @date: 2024/12/11
 **/
public class TopicList implements ListList<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> Iterator() {
        return new TopicIterator(topics);
    }
}
