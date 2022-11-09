# OMS

Git Flow:

Два protected бренча
**master** - в него сливаем релизные версии
**dev** - сливаем все feature ветки

Как коммитим изменения

Если делаем фичу - делаем новый branch от dev ветки в формате feature/[Номер-Задачи]
Если делаем хот фикс - делаем новый branch от master в формате hotfix/[Номер-Задачи]

При залитии фичи делаем squash
Хот фиксы льем в дев и мастер без squash
 
![image](https://user-images.githubusercontent.com/24751213/200927331-1be39a59-73b6-44ea-8a25-b3b4bb191d37.png)

Push в master/dev запрещен, только Pull Request'ы. Для прохождения ревью требуется 2 апрува
