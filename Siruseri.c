#include <stdio.h>
#include <stdlib.h>

void sort(int array[], int n);
int search(int array[], int n, int key);
void printarray(int array[], int n);

void main() {

    int n;
    scanf("%d", &n);

    int *larray = malloc(sizeof(int) * n);
    int *uarray = malloc(sizeof(int) * n);
    int *uarrayv = malloc(sizeof(int) * n);

    int *ans = malloc(sizeof(int) * n);
    
    for (int i = 0; i < n; i++) 
    {
        scanf("%d %d", &larray[i], &uarray[i]);
        uarrayv[i] = uarray[i];
    }

    sort(uarray, n);

    for (int i = 0; i < n; i++) 
    {
        int e = search(uarray, n, uarrayv[i]);

        int p = e * 2;

        ans[i] = p; 

    }

    printarray(ans, n);

}

void sort(int array[], int n)
{
    int i, j, key;
    for (i = 1; i < n; i++) 
    {
        key = array[i];
        j = i - 1;

        while (j >= 0 && array[j] > key) 
        {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }
}

int search(int array[], int n, int key)
{
    int l = 0, m, h = n - 1;

    while (l <= h) 
    {
        m  = l + (h - l) / 2;

        if (key == array[m])
            return m;
        else if (key < array[m])
            h = m - 1;
        else
            l = m + 1;
    }
    return -1;
    
}

void printarray(int array[], int n)
{
    printf("\nThe array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
}
