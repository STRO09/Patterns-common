public class PAtterns {

public static void main(String args[]){

for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(j<=i){
char ch =(char)(i+65);
System.out.print(ch);
}
else {
System.out.print(" ");
}
}
System.out.println();
}


System.out.println("-------------------------------------------------");


for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(j<=i){
char ch =(char)(j+65);
System.out.print(ch);
}
else {
System.out.print(" ");
}
}
System.out.println();
}


System.out.println("-------------------------------------------------");


for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(j>=i){
char ch =(char)(69-j);
System.out.print(ch);
}
else {
System.out.print(" ");
}
}
System.out.println();
}

System.out.println("-------------------------------------------------");

for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(j>=i){

System.out.print("* ");
}
else {
System.out.print(" ");
}
}
System.out.println();
}

System.out.println("-------------------------------------------------");

for(int i=0;i<5;i++){
for(int j=4;j>=0;j--){
if(j<=i){

System.out.print("* ");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
for(int i=1;i<5;i++){
for(int j=0;j<5;j++){
if(j>=i){

System.out.print("* ");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
System.out.println("-------------------------------------------------");

for(int i=0;i<5;i++){

// leaqding spaces
for(int j=0;j<i;j++){
System.out.print(" ");
}

// n-i
for(int j=0;j<2*(5-i)-1;j++){

if(i==0||j==0||j==(2*(5-i)-2)){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();

}
System.out.println("-------------------------------------------------");


for(int i=4;i>=0;i--){

// leaqding spaces
for(int j=0;j<i;j++){
System.out.print(" ");
}

// n-i
for(int j=0;j<2*(5-i)-1;j++){

if(i==0||j==0||j==(2*(5-i)-2)){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();

}

System.out.println("-------------------------------------------------");

for(int i=4;i>=0;i--){

// leaqding spaces
for(int j=0;j<i;j++){
System.out.print(" ");
}

// n-i
for(int j=0;j<2*(5-i)-1;j++){

if(j==0||j==(2*(5-i)-2)){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();

}

for(int i=1;i<5;i++){

// leaqding spaces
for(int j=0;j<i;j++){
System.out.print(" ");
}

// n-i
for(int j=0;j<2*(5-i)-1;j++){

if(j==0||j==(2*(5-i)-2)){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();

}




}
}