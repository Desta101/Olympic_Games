package Model;
//Shimon Desta-203670286
public class Date {

        private int day, month, year;
        
        
        public Date(int day, int month, int year) {
            if (year >= 2000 && year <= 2020) 
                this.year = year;
            else 
                this.year = 2020; 
            if (month >= 1 && month <= 12) 
                this.month = month;
            else 
                this.month = 1;
            if (day >= 1 && day <= 31) 
                this.day = day;
             else 
                this.day = 1;
        }
        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
        public Date() {
                this.year = 2020;
     
                this.month = 10;
 
                this.day = 1;
        }
        public Date(Date other) {
            this.day = other.day;
            this.month = other.month;
            this.year = other.year;  
        }
        public String toString() {
            String sb = new String();
            sb = day + "/" + month + "/" + year;
            return sb;
        }
      


    }

