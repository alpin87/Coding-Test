����   ? v
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I  java/util/HashSet
  
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
    ! " add (Ljava/lang/Object;)Z $ java/util/ArrayList
 # &  ' (Ljava/util/Collection;)V
 ) * + , - java/util/Collections sort (Ljava/util/List;)V / java/lang/StringBuilder
 . 
 # 2 3 4 iterator ()Ljava/util/Iterator; 6 7 8 9 : java/util/Iterator hasNext ()Z 6 < = > next ()Ljava/lang/Object;
  @ A  intValue
 . C D E append (I)Ljava/lang/StringBuilder; G  
 . I D J -(Ljava/lang/String;)Ljava/lang/StringBuilder;	 
 L M N out Ljava/io/PrintStream;
 . P Q R toString ()Ljava/lang/String;
 T U V W X java/io/PrintStream println (Ljava/lang/String;)V Z 	Main10867 Code LineNumberTable LocalVariableTable this LMain10867; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; sc Ljava/util/Scanner; c hs Ljava/util/HashSet; 	arrayList Ljava/util/ArrayList; q Ljava/lang/StringBuilder; LocalVariableTypeTable (Ljava/util/HashSet<Ljava/lang/Integer;>; *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable e 
SourceFile Main10867.java ! Y           [   /     *� �    \        ]        ^ _   	 ` a  [  s     �� Y� 	� L+� =� Y� N6� -+� � � W���� #Y-� %:� (� .Y� 0:� 1:� 5 � "� ; � � ?6� BF� HW��ڲ K� O� S�    \   :           !  -  3  =  B  K  k  x  {  �  ]   R    b c  k  b c    � d e    | f g   w h c   o i j  = J k l  K < m n  o      o i p  = J k q  r   & �   s    � �  # . 6� (  t    u