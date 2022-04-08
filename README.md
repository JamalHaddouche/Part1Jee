# Part1Jee
Parte 1 : 
dans la premiere implèmentation de l'interface IDao nous retournons une valeurs aléatoirement
dans la 2éme implementation de l'interface IDao nous retournons une valeurs d'un capteur
Pour le 1er test : si nous voulons récupérer la valeur calculé avec l'une des deux implèmentations il faut instancier 
d'une manière statique un objet de l'une des implèmentations ce qui mets la maintenance déficile ,par ce que à chaque fois  il fauts modifier l'instancié
![image](https://user-images.githubusercontent.com/82270887/162347989-58a82cb2-fa80-484c-bf79-3cb0a78c2008.png)

![c1](https://user-images.githubusercontent.com/82270887/162348144-bbef4ce6-2ded-4667-8c07-1e60999b0619.png)

###################

![image](https://user-images.githubusercontent.com/82270887/162348301-4de894d8-4a27-4504-8342-f298b9c49191.png)

###################

pour éviter le problème de modifier chaque fois dans le code il faut  instancier des objets de manière dynamique  comme il est introduit dans le fichier Presentation 2 ,si nous voulons appelé n'import quel implémentations  il suffit de changer dans le fichier config.txt et de mettre dans la 1er ligne la racine de l'iumplèmentation corréspondant
voici les résultat données après chaque modification :
dans la 1er ligne de fichier config text ona : dao.DaoImp

![c4](https://user-images.githubusercontent.com/82270887/162349600-a7ff4eba-7584-435f-9437-048e3220f00b.png)

dans la 1er ligne de fichier config text ona : ext.DaoImp2

![c5](https://user-images.githubusercontent.com/82270887/162349721-885878ca-7a2f-44b0-9f76-176d5efa89fd.png)


dans la 1er ligne de fichier config text ona : ext.DaoImplWs

![c3](https://user-images.githubusercontent.com/82270887/162349766-fb295ea8-af3c-4e0f-97ee-9853f4ef2c6a.png)
