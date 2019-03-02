package Day1;

/**
 * 线性表规范
 */
public interface Sequence {
    /**
     *向綫性表中添加元素
     * @param data 要儲存的元素
     */
    void add(Object data);

    /**
     *綫性表中刪除元素
     * @param index 要刪除元素的下標
     * @return 是否刪除成功
     */
    boolean remove (int index);

    /**
     *在綫性表中查找指定索引的元素
     * @param index 要查找的索引
     * @return 是否删除成功
     */
    Object get(int index);

    /**
     * 判断线性表中是否有指定元素
     * @param data 要查找的元素内容
     * @return
     */
    boolean contains(Object data);

    /**
     * 修改线性表中指定内容
     * @param index 要修改的元素下标
     * @param newData 修改后的内容
     * @return
     */
    Object set(int index,Object newData);

    /**
     * 返回当前线性表中元素个数
     * @return
     */
    int size();

    /**
     * 直接清空线性表内容
     */
    void clear();

    /**
     * 将线性表转化为数组
     * @return
     */
    Object[] toArray();
}
