package Chap7_4;

import java.io.Serializable;
/** DateSet数据流对象 */
public class DataSet implements Serializable {
        private static final long serialVersionUID = -4833027480140156492L;
        public int number;  //编号
        public String color;   //颜色
        public int data;   //数据
        public int getNumber() {
            return number;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
}
