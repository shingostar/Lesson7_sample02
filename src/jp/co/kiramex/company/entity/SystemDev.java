package jp.co.kiramex.company.entity;

public class SystemDev extends Division {

    @Override
    public  void greeting() {
        System.out.println("システム開発部の皆さんおはようございます");
    }

    @Override
    public void programming() {
        System.out.println("システム開発部の皆さんはプログラミング可能です");
    }

}
