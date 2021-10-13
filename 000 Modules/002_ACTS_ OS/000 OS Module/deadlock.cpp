#include <iostream>
using namespace std;

int user1 = 0; 
int user2 = 0; 
int user3 = 0; 
int found_someone = 0; 

void release_user1()
{
user1 = 1; 
}

void find_user1()
{
if(user1)
{
cout<<"Caught user1"<<endl;
}
else
{
cout<<"Where is user1"<<endl;
}
}

void release_user2()
{
user2 = 1;
}

void find_user2()
{
if(user2)
{
cout<<"Caught user2"<<endl;
}
else
{
cout<<"Where is user2?"<<endl;
}
}

void release_user3()
{
user3 = 1;
}
void find_user3()
{
if(user3)
{
cout<<"caught user3"<<endl;
}
else
{
cout<<"Where is user3?"<<endl;
}
}

void process1()
{
find_user1();
if(user1)
{
release_user2();
found_someone = 1;
}
}

void process2()
{
find_user2();

if(user2)
{
release_user3();
found_someone = 1;
}
}

void process3()
{
find_user3();
if(user3)
{
release_user1();
found_someone = 1;
}
}

int main()
{
while(!found_someone)
{
process1();
process2();
process3();
}
}
